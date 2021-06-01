def binaereSuche(w, L) {
  first = 0
  last = L.size() -1
  while (first <= last) {
    int middle = (first + last)/2
    if(L[middle] < w) {
      first = middle + 1
    }
    else {
      if (L[middle] == w) return true
      last = middle - 1
    }
  }
  return false
}