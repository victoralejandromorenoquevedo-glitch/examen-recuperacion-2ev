package es.fplumara.dam1.restaurantes.io;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PlatoEstrellaCsvWriter {

    public void write(String filePath, List<PlatoEstrellaCsvRow> rows) throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.builder()
                .setHeader(
                        "restaurante",
                        "codigoElemento",
                        "nombreElemento",
                        "tipoElemento",
                        "popularidad",
                        "mesasDistintas"
                )
                .build();

        try (Writer writer = Files.newBufferedWriter(Path.of(filePath));
             CSVPrinter printer = new CSVPrinter(writer, format)) {

            for (PlatoEstrellaCsvRow row : rows) {
                printer.printRecord(
                        row.restaurante(),
                        row.codigoElemento(),
                        row.nombreElemento(),
                        row.tipoElemento(),
                        row.popularidad(),
                        row.mesasDistintas()
                );
            }

            printer.flush();
        }
    }
}
