#!/bin/bash

curl -X GET "http://localhost:8080/scooter/players?do_shuffle=true" | jq

