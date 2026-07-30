# Database Design

## users

id

name

email

password

----------------

## tasks

id

title

description

priority

status

due_date

category_id

user_id

----------------

## categories

id

name

----------------

## activity_logs

id

action

time

----------------

## dependencies

id

task_id

depends_on
