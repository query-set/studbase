#!/bin/bash

FILE=$HOME/.zshenv
EXISTS="${FILE} exists in your home directory!"
NOT_EXISTS="${FILE} does not exist in your home directory!"

if [[ -f FILE ]]; then
    echo $EXISTS
else
    echo $NOT_EXISTS
fi

# Extra: it can be written shorter
[[ -f FILE ]] && echo $EXISTS || echo $NOT_EXISTS
