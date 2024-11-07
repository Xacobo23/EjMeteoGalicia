package org.example;

import com.google.gson.*;

import java.lang.reflect.Type;

public class ConcelloAdapter implements JsonSerializer<Concello>, JsonDeserializer<Concello> {

    @Override
    public Concello deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Concello concello = new Concello();

        concello.setIdConcello(jsonObject.get("id").getAsInt());
        concello.setNomeConcello(jsonObject.get("nombre").getAsString());

        return concello;
    }

    @Override
    public JsonElement serialize(Concello concello, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("ID", concello.getIdConcello());
        jsonObject.addProperty("Nome", concello.getNomeConcello());


        return jsonObject;
    }
}
