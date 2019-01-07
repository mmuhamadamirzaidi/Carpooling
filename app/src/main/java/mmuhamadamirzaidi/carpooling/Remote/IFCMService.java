package mmuhamadamirzaidi.carpooling.Remote;

import mmuhamadamirzaidi.carpooling.Model.FCMResponse;
import mmuhamadamirzaidi.carpooling.Model.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAk7DhSE0:APA91bFRG3MImUfgRIXh72drrlO3SGekqOHYu-ZcxeG8As46ClQHuCiMwpYIXLgFXZeM4hDurWWqk991Xyn6GRvPmW2NmZk7SOOZCCcJhdPLyfKhHpI_kLDnyDlGGorNLqrCGVFFi7It"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage (@Body Sender body);
}
