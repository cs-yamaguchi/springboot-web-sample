SELECT
  actor.*,
  prefecture.name prefecture_name
FROM actor LEFT JOIN prefecture ON prefecture.id = actor.birthplace_id
WHERE actor.name LIKE /* @infix(name) */'aaa' ORDER BY actor.id ASC
