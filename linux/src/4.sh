#!/bin/bash

function first {
    # Function that create user with given name.

    name=$1

    # It requires password of root.
    sudo useradd $name
}

function second {
    # Function that adds, subtracts and multiplies two given numbers.

    x=$1
    y=$2
    echo add: $[$x+$y]
    echo subtract: $[$x-$y]
    echo multiply: $[$x*$y]
}

function third {
    # Function that creates user with given name and adds it to the given group.

    username=$1
    group=$2

    # It requires password of root.
    sudo useradd -g $group $username
}

function fourth {
    # Function that allows to change the password of given user.

    user=$1

    # It requires password of root.
    sudo passwd $user
}

function fifth {
    # Function that compress given file.

    directory=$1
    gzip $directory
    echo Zipped the $directory
}

function sixth {
    number_of_users=$1

    for i in $(seq 1 $number_of_users)
    do
	username="testuser$i"
	sudo useradd $username
	echo "Added user $username"
    done
}

function seventh {
    sudo useradd uczen1
    directory=/home/uczen1
    mkdir $directory/public_html
    sudo chmod 711 $directory
    chown uczen1 $directory

    # Set password
    sudo passwd uczen1
}
