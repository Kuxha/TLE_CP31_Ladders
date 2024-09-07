# The function to get occurences
def GetOccurencesCount(mystring):
  # we create a dictionary to store the occurences of each word
  d = dict()
  # here we basically take the string we have, and turn it into a list of string
  # the words are created after separating the original sstring with blank
  words = mystring.split()
  # iterate through all the words one by one
  # if the key already exists - increment the value . else value is 1
  for word in words:
      if word in d:
          d[word] = d[word] + 1
      else:
          d[word] = 1
  return d
# Function to print a dictionary
def PrintDictionary(d):
    for key in list(d.keys()):
        print(key, ":", d[key])

#example of using the code
#update mystring for more testing
myString = "I am I am in New York"
occurence  = GetOccurencesCount(myString)
PrintDictionary(occurence)
