package org.example;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PrediccionConcelloAdapter implements JsonSerializer<Prediccion>, JsonDeserializer<Prediccion> {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    @Override
    public Prediccion deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonObject p = jsonObject.getAsJsonObject("predConcello");

        Prediccion prediccion = new Prediccion();

        List<PrediccionDia> listPredDia = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(PrediccionDia.class, new PrediccionDiaAdapter())
                .setPrettyPrinting()
                .create();

        for (JsonElement elementDia : p.get("listaPredDiaConcello").getAsJsonArray()){
            PrediccionDia prediccionDia = gson.fromJson(elementDia, PrediccionDia.class);
            listPredDia.add(prediccionDia);

        }

        prediccion.setIdConcello(p.get("idConcello").getAsInt());

        prediccion.setNomeConcello(p.get("nome").getAsString());

        prediccion.setListPred(listPredDia);

        return prediccion;
    }

    @Override
    public JsonElement serialize(Prediccion prediccion, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();

        JsonObject jsonPrediccion = new JsonObject();

        jsonPrediccion.addProperty("ID Concello", prediccion.getIdConcello());
        jsonPrediccion.addProperty("Nome Concello", prediccion.getNomeConcello());

        JsonArray jsonArray = new JsonArray();
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(PrediccionDia.class, new PrediccionDiaAdapter())
                .setPrettyPrinting()
                .create();

        for (PrediccionDia prediccionDia : prediccion.getListPred()){
//            JsonElement jsonElement = gson.toJsonTree(prediccionDia);
            JsonElement jsonElement = gson.toJsonTree(prediccionDia, PrediccionDia.class);

    /*
    ao indicar PrediccionDia.class aseguraste de que o gson pille a clase
    que corresponde en vez de poder dar error de tipos
    */
            jsonArray.add(jsonElement);
        }


        jsonPrediccion.add("Lista Predcciones", jsonArray);

        jsonObject.add("Prediccion Concello",jsonPrediccion );

        return jsonObject;
    }
}
