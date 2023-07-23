import com.example.newspaperappapi.Article
import com.example.newspaperappapi.apiobject
import com.example.newspaperappapi.newdataclass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object jsonresponse {
    // Modify the getdata function to accept a callback
    fun getdata(country: String, category: String, apiKey: String, callback: (ArrayList<Article>) -> Unit) {
        val listitem = ArrayList<Article>()
        apiobject.apiService.getData(country, category, apiKey).enqueue(object :
            Callback<newdataclass> {
            override fun onResponse(call: Call<newdataclass>, response: Response<newdataclass>) {
                val item = response.body()
                if (item != null) {
                    val list = item.articles
                    for (items in list) {
                        listitem.add(items)
                    }
                    // Call the callback with the fetched articles
                    callback(listitem)
                } else {
                    // Handle case when the response is null
                }
            }

            override fun onFailure(call: Call<newdataclass>, t: Throwable) {
                // Handle failure, e.g., network issues
            }
        })
    }
}
