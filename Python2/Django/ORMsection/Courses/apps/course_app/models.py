from __future__ import unicode_literals

from django.db import models

# Create your models here.
class coursesManager(models.Manager):
    def addCourse(self, name, desc):
        response = {
            "errors": [],
            "valid": True,
            "course": None
        }
        if len(name) < 5:
            response["valid"] = False
            response["errors"].append("Course name must be more than 5 characters long.")

        if len(desc) < 15:
            response["valid"] = False
            response["errors"].append("Description must be more than 15 characters long.")
        if response["valid"]:
            response["course"] = courses.objects.create(
                name=name,
                desc=desc
            )
        return response

class courses(models.Model):
    name = models.CharField(max_length=255)
    desc = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add = True)
    updated_at = models.DateTimeField(auto_now = True)
    objects = coursesManager()
