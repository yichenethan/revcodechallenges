from abc import ABC, abstractmethod
import unittest

class Animal(ABC):
  def __init__(self, color):
    self.color = color

  def yell(self):
    pass

  def set_color(self, color):
    self.color = color

class Person(Animal):
  def yell(self):
    print("AHHHH")
    self.color = "red"

try:
  ret = Person("blue")
  ret.yell()
except:
  print('person defined wrongly')
