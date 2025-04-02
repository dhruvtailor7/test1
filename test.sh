#!/bin/bash

# Check if secret is provided
if [ -z "$1" ]; then
    echo "Error: No secret provided"
    exit 1
fi

# Log the secret
echo "Received secret value: $1" 
