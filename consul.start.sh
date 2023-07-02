#!/bin/sh

consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=192.168.43.177