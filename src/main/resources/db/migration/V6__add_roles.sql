INSERT INTO roles(title, parent_id, current, blocked)
SELECT 'Ruby', id, false, true
FROM roles
WHERE title = 'Developer';

INSERT INTO roles(title, parent_id, current, blocked)
SELECT 'Ruby Architect', id, false, true
FROM roles
WHERE title = 'Ruby';

INSERT INTO roles(title, parent_id, current, blocked)
SELECT 'Ruby Senior', id, false, true
FROM roles
WHERE title = 'Ruby Architect';

INSERT INTO roles(title, parent_id, current, blocked)
SELECT 'Ruby Middle', id, false, true
FROM roles
WHERE title = 'Ruby Senior';

INSERT INTO roles(title, parent_id, current, blocked)
SELECT 'Ruby Junior', id, false, false
FROM roles
WHERE title = 'Ruby Middle';