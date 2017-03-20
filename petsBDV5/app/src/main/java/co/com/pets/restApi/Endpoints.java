package co.com.pets.restApi;


import co.com.pets.restApi.model.UsuarioResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by xander on 18/03/2017.
 */

public interface Endpoints {


//Para Fireabase

    @FormUrlEncoded
    @POST(ConstantesRestApi.KEY_POST_ID_TOKEN)
    Call<UsuarioResponse> registrarTokenID(@Field("token") String token, @Field("id_usuario_instagram") String id_usuario_instagram);
}
