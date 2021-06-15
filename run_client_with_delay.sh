#!/bin/bash

curl -X GET "http://localhost:8080/scooter/players?delay_in_seconds=5" | jq

