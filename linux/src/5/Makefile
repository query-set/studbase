.POSIX:

CC     = gcc
CFLAGS = -Wall
LFLAGS =
OBJS   = main.o funs.o

all: main clean

main: $(OBJS)
	$(CC) $^ -o $@

main.o: main.c
	$(CC) $(CFLAGS) $(LFLAGS) -c $< -o $@

funs.o: funs.c
	$(CC) $(CFLAGS) $(LFLAGS) -c $< -o $@

clean:
	rm -f $(OBJS)

# .PHONY: clean
