package org.example;

import com.google.gson.*;

import java.lang.reflect.Type;


public class PrediccionDiaAdapter implements JsonSerializer<PrediccionDia>, JsonDeserializer<PrediccionDia> {

    @Override
    public PrediccionDia deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        PrediccionDia prediccionDia = new PrediccionDia();

        prediccionDia.setNivelAviso(jsonObject.get("nivelAviso").getAsByte());

        prediccionDia.setDataPredivion(jsonObject.get("dataPredicion").getAsString());

        prediccionDia.settMin(jsonObject.get("tMin").getAsInt());

        prediccionDia.settMax(jsonObject.get("tMax").getAsInt());

        prediccionDia.setUvMax(jsonObject.get("uvMax").getAsInt());


        prediccionDia.setCeo(
                new Ceo(
                        jsonObject.get("ceo").getAsJsonObject().get("manha").getAsInt(),
                        jsonObject.get("ceo").getAsJsonObject().get("noite").getAsInt(),
                        jsonObject.get("ceo").getAsJsonObject().get("tarde").getAsInt()
                )
        );

        prediccionDia.settMaxFranxa(
                new Franxa(
                        jsonObject.get("tmaxFranxa").getAsJsonObject().get("manha").getAsInt(),
                        jsonObject.get("tmaxFranxa").getAsJsonObject().get("noite").getAsInt(),
                        jsonObject.get("tmaxFranxa").getAsJsonObject().get("tarde").getAsInt()
                )
        );

        prediccionDia.settMinFranxa(
                new Franxa(
                        jsonObject.get("tminFranxa").getAsJsonObject().get("manha").getAsInt(),
                        jsonObject.get("tminFranxa").getAsJsonObject().get("noite").getAsInt(),
                        jsonObject.get("tminFranxa").getAsJsonObject().get("tarde").getAsInt()
                )
        );
        prediccionDia.setpChoiva(
                new PChoiva(
                        jsonObject.get("pchoiva").getAsJsonObject().get("manha").getAsInt(),
                        jsonObject.get("pchoiva").getAsJsonObject().get("noite").getAsInt(),
                        jsonObject.get("pchoiva").getAsJsonObject().get("tarde").getAsInt()
                )
        );
        prediccionDia.setVento(
                new Vento(
                        jsonObject.get("vento").getAsJsonObject().get("manha").getAsInt(),
                        jsonObject.get("vento").getAsJsonObject().get("noite").getAsInt(),
                        jsonObject.get("vento").getAsJsonObject().get("tarde").getAsInt()
                )
        );


        return prediccionDia;
    }

    @Override
    public JsonElement serialize(PrediccionDia prediccionDia, Type type, JsonSerializationContext jsonSerializationContext) {

        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("dataPredicion", prediccionDia.getDataPredivion());
        jsonObject.addProperty("nivelAviso", prediccionDia.getNivelAviso());
        jsonObject.addProperty("tMax", prediccionDia.gettMax());
        jsonObject.addProperty("tMin", prediccionDia.gettMin());
        jsonObject.addProperty("uvMax", prediccionDia.getUvMax());

        JsonObject jsonCeo = new JsonObject();
        jsonCeo.addProperty("manha", prediccionDia.getCeo().getManha());
        jsonCeo.addProperty("tarde", prediccionDia.getCeo().getTarde());
        jsonCeo.addProperty("noite", prediccionDia.getCeo().getNoite());

        jsonObject.add("ceo", jsonCeo);

        return jsonObject;
    }
}
