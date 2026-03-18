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

public class DegustacionCsvReader {

    public List<DegustacionCsvRow> read(String filePath) throws IOException {
        List<DegustacionCsvRow> rows = new ArrayList<>();

        CSVFormat format = CSVFormat.DEFAULT.builder()
                .setHeader()
                .setSkipHeaderRecord(true)
                .setTrim(true)
                .build();

        try (Reader reader = Files.newBufferedReader(Path.of(filePath));
             CSVParser parser = new CSVParser(reader, format)) {

            for (CSVRecord record : parser) {
                DegustacionCsvRow row = new DegustacionCsvRow(
                        record.get("id"),
                        record.get("idMesa"),
                        record.get("codigoElemento"),
                        Integer.parseInt(record.get("unidades")),
                        Double.parseDouble(record.get("valoracion"))
                );
                rows.add(row);
            }
        }

        return rows;
    }
}
