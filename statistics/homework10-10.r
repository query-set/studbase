A <- matrix(data = vector(),
            nrow = 10,
            ncol = 10,
            dimnames = list(c(11:20), c(11:20)))

for (i in 11:20) {
  for (y in 11:20) {
    A[i-10, y-10] <- i*y
  }
}
print(A)