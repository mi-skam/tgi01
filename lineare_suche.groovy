def lineareSuche(w, L) {
  i = 0
  while (i < L.size()) {
    if (L[i] == w) return true
    i++
  }
  return false
}
// test1
w1 = 1
L1 = [2, 4, 5, 6]
println(lineareSuche(w1, L1))

// test2
w2 = 2
L2 = [2, 4, 5, 6]
println(lineareSuche(w2, L2))