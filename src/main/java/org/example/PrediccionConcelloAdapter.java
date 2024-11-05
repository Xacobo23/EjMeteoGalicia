package org.example;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PrediccionConcelloAdapter implements JsonSerializer<Prediccion>, JsonDeserializer<Prediccion> {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    @Override
    public Prediccion deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonObject p = jsonObject.getAsJsonObject("predConcello");

        Prediccion prediccion = new Prediccion();

        for (JsonElement elementDia : p.get("listaPredDiaConcello").getAsJsonArray()){
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(PrediccionDia.class, new PrediccionDiaAdapter())
                    .setPrettyPrinting()
                    .create();

            PrediccionDia prediccionDia = gson.fromJson(elementDia, PrediccionDia.class);

        }

        prediccion.setIdConcello(p.get("idConcello").getAsInt());

        prediccion.setNomeConcello(p.get("nome").getAsString());

        return prediccion;
    }

    @Override
    public JsonElement serialize(Prediccion prediccion, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();

        JsonObject jsonPrediccion = new JsonObject();

        jsonPrediccion.addProperty("ID Concello", prediccion.getIdConcello());
        jsonPrediccion.addProperty("Nome Concello", prediccion.getNomeConcello());

        jsonObject.add("Prediccion Concello",jsonPrediccion );

        return jsonObject;
    }
}
