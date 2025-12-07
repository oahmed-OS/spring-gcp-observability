Notes:

- GCP duplicates traces with the tracing starter package. Workaround is to disable zipkin trace exporting via
  `management.zipkin.tracing.export.enabled=false`
    - Reference: https://github.com/GoogleCloudPlatform/spring-cloud-gcp/issues/4055
- RestClient.Builder requirement
- MDC.put adds context to log payloads