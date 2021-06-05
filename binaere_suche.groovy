@groovy.transform.CompileStatic

boolean binaereSuche(int w, int[] liste) {
  int first = 0
  int last = liste.size() - 1
  while (first <= last) {
    int middle = (first + last) / 2 as Integer
    if (liste[middle] < w) {
      first = middle + 1
    }
    else {
      if (liste[middle] == w) {
        return true
      }
      last = middle - 1
    }
  }
  return false
}

// test 1

w = 44
liste = [2, 3, 4, 5, 44, 9, 33]
println(binaereSuche(w, liste))
