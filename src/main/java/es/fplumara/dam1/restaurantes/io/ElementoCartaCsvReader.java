package es.fplumara.dam1.restaurantes.io;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ElementoCartaCsvReader {

    public List<ElementoCartaCsvRow> read(String filePath) throws IOException {
        List<ElementoCartaCsvRow> rows = new ArrayList<>();

        CSVFormat format = CSVFormat.DEFAULT.builder()
                .setHeader()
                .setSkipHeaderRecord(true)
                .setTrim(true)
                .build();

        try (Reader reader = Files.newBufferedReader(Path.of(filePath));
             CSVParser parser = new CSVParser(reader, format)) {

            for (CSVRecord record : parser) {
                ElementoCartaCsvRow row = new ElementoCartaCsvRow(
                        record.get("tipo"),
                        record.get("codigo"),
                        record.get("nombre"),
                        record.get("restaurante"),
                        Double.parseDouble(record.get("precioBase")),
                        record.get("tiempoPreparacion"),
                        record.get("compartible"),
                        record.get("guarnicion"),
                        record.get("servidoFrio"),
                        record.get("alcoholica"),
                        record.get("volumenMl"),
                        record.get("alergenos")
                );
                rows.add(row);
            }
        }

        return rows;
    }
}
