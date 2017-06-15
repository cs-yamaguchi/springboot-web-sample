SELECT
  actor.*,
  prefecture.name prefecture_name
FROM actor LEFT JOIN prefecture ON prefecture.id = actor.birthplace_id ORDER BY actor.id;