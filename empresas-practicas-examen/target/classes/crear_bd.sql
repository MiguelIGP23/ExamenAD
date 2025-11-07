CREATE TABLE empresas (
 id INTEGER PRIMARY KEY AUTOINCREMENT,
 nombre TEXT NOT NULL,
 direccion TEXT
);

-- TODO: Completar tabla alumnos con los campos:
-- id (PK), nombre, idEmpresa (FK hacia empresas.id), ciclo
-- La FK debe incluir: ON DELETE SET NULL
