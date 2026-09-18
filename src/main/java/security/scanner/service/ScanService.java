package security.scanner.service;

import org.springframework.stereotype.Service;
import security.scanner.model.Scan;

@Service
public class ScanService {

    public Scan analyzeUrl(String url) {

        Scan scan = new Scan();

        scan.setUrl(url);
        scan.setStatus("URL recebida com sucesso");

        return scan;
    }
}