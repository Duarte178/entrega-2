# Backend Sensor Readings Service

## Lista de Integrantes
- Gabriel Duarte - RM 550185
- Arthur Barbato - RM 99535
- Pedro Henrique - RM 98609

## Como Executar
1. Compile e execute:
   ```bash
   mvn spring-boot:run
   ```
2. Banco H2 em modo file será criado em `./data/readings.mv.db`.

## Endpoints Disponíveis
- `POST /api/readings`  
  Salva nova leitura.  
  Corpo JSON:  
  ```json
  {
    "sensorId": "sensor1",
    "value": 23.5,
    "timestamp": "2025-06-17T10:15:30"
  }
  ```
- `GET /api/readings`  
  Lista todas as leituras.
- `GET /api/readings/{sensorId}`  
  Filtra leituras por sensor.

## Exemplos de Requisição CURL
- Criar leitura:
  ```bash
  curl -X POST -H "Content-Type: application/json" \
       -d '{"sensorId":"sensor1","value":23.5,"timestamp":"2025-06-17T10:15:30"}' \
       http://localhost:8080/api/readings
  ```
- Listar leituras:
  ```bash
  curl http://localhost:8080/api/readings
  ```
- Filtrar por sensor:
  ```bash
  curl http://localhost:8080/api/readings/sensor1
  ```
