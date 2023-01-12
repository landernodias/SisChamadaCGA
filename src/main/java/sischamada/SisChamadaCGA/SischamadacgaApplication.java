package sischamada.SisChamadaCGA;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sischamada.SisChamadaCGA.entity.CandidatoListaEspera;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@SpringBootApplication
public class SischamadacgaApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SischamadacgaApplication.class, args);
		//		Locale.setDefault(Locale.US);
		try(var csv = new FileReader("pessoas.csv")) {
			List<CandidatoListaEspera> beans = new CsvToBeanBuilder<CandidatoListaEspera>(csv)
					.withSeparator(',')
					.withType(CandidatoListaEspera.class)
					.build()
					.parse();
//			System.out.println(beans.get(1).getNomeEtapa());
			for (CandidatoListaEspera bean : beans) {
				System.out.println(beans.indexOf(bean) + ": " + bean);
			}

		}
	}
}
