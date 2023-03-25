#!/bin/bash
echo """
runtime: nodejs
env: flex
service: $GCLOUD_APP_SERVICE
resources:
  cpu: 1
  memory_gb: 1
  disk_size_gb: 1
automatic_scaling:
  min_num_instances: 1
  max_num_instances: 1
  cool_down_period_sec: 180
  cpu_utilization:
    target_utilization: 0.6
  target_concurrent_requests: 100
env_variables:
  ENV: $ENV
"""
