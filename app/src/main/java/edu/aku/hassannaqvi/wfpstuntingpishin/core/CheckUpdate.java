package edu.aku.hassannaqvi.wfpstuntingpishin.core;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by hassan.naqvi on 12/2/2016.
 */

public class CheckUpdate extends AsyncTask<String, String, String> {

    private final String TAG = "GetRand()";
    HttpURLConnection urlConnection;
    private Context mContext;
    private ProgressDialog pd;

    public CheckUpdate(Context context) {
        mContext = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext);
        pd.setTitle("App Update");
        pd.setMessage("Checking update on server...");
        pd.show();

    }

    @Override
    protected String doInBackground(String... urls) {
        // params comes from the execute() call: params[0] is the url.
        try {
            return downloadUrl(MainApp._APP_URL + "output.json");
        } catch (IOException e) {
            return "Unable to retrieve web page. URL may be invalid.";
        }

    }

    @Override
    protected void onPostExecute(String result) {

        //Do something with the JSON string

        JSONArray json = null;
        //json = json.replaceAll("\\[", "").replaceAll("\\]","");
        Log.d(TAG, result);

        if (result != null) try {
            pd.setMessage("Update Info Received");
            pd.show();
            json = new JSONArray(result);
            JSONObject jObject = new JSONObject(json.getString(0));


            JSONObject properties = new JSONObject(jObject.getString("properties"));
            String packageId = properties.getString("packageId");
            Toast.makeText(mContext, packageId, Toast.LENGTH_LONG).show();

            // Match Package Name
            if (packageId.equals(MainApp._PACKAGE_NAME)) {
                JSONObject apkInfo = new JSONObject(jObject.getString("apkInfo"));
                Integer versionCode = apkInfo.getInt("versionCode");
                Toast.makeText(mContext, String.valueOf(versionCode), Toast.LENGTH_LONG).show();

                // Match Version code
                if (versionCode > MainApp._VERSION_CODES) {

                    // Get File Name
                    String path = jObject.getString("path");
                    Toast.makeText(mContext, path, Toast.LENGTH_LONG).show();
                    MainApp._NEW_UPDATE = true;

                } else {
                    Toast.makeText(mContext, "No new update found", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(mContext, "Package name did not match. Check file!" + MainApp._PACKAGE_NAME, Toast.LENGTH_LONG).show();
                Toast.makeText(mContext, packageId, Toast.LENGTH_LONG).show();


            }
            pd.dismiss();


        } catch (JSONException e2) {
            e2.printStackTrace();

        }


    }

    // Given a URL, establishes an HttpUrlConnection and retrieves
// the web page content as a InputStream, which it returns as
// a string.
    private String downloadUrl(String userUrl) throws IOException {
        InputStream is = null;
        // Only display the first 500 characters of the retrieved
        // web page content.
        int len = 500;

        try {
            URL url = new URL(userUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(10000 /* milliseconds */);
            conn.setConnectTimeout(15000 /* milliseconds */);
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("charset", "utf-8");
            conn.setUseCaches(false);
            // Starts the query
            conn.connect();
            int response = conn.getResponseCode();
            Log.d(TAG, "The response is: " + response);
            is = conn.getInputStream();

            // Convert the InputStream into a string
            String contentAsString = readIt(is, len);
            return contentAsString;

            // Makes sure that the InputStream is closed after the app is
            // finished using it.
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    // Reads an InputStream and converts it to a String.
    public String readIt(InputStream stream, int len) throws IOException {
        Reader reader = null;
        reader = new InputStreamReader(stream, "UTF-8");
        char[] buffer = new char[len];
        reader.read(buffer);
        return new String(buffer);
    }
}
