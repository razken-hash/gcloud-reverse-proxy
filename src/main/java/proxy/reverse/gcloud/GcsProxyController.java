package proxy.reverse.gcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GcsProxyController {

    @GetMapping("/gcs/{bucketId}")
    public Map<String, String> getFile(
            @PathVariable String bucketId,
            @RequestParam("path") String filePath) {

        return Map.of(
                "bucketId", bucketId,
                "filePath", filePath
        );
    }
}