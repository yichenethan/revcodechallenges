import unittest
import Animals

class testAnimals(unittest.TestCase):

  def setUp(self):
    pass

  def test_person_yell(self):
    person = Animals.Person("blue")
    person.yell()
    self.assertEqual(person.color, "red", "yelling should make the person red")


if __name__ == '__main__':
    unittest.main()