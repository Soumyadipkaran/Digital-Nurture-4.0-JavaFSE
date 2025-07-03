# JPA vs Hibernate vs Spring Data JPA

### What the question asked:
This hands-on is about understanding the difference between JPA, Hibernate, and Spring Data JPA. It does not require creating a working project. Just explanation and basic code examples.

What I have done:
- Written simple explanations of JPA, Hibernate, and Spring Data JPA
- Added code snippets to show how each one is used
- No Spring Boot project, no database, no output

### JPA:
JPA (Java Persistence API) is a specification. It defines how Java objects can be stored and retrieved from a database. It does not provide actual code. Tools like Hibernate implement JPA.

### Hibernate:
Hibernate is an ORM tool. It implements JPA and handles database operations. But in Hibernate we write more code to manage sessions and transactions.

- Example code using Hibernate:
```
public Integer addEmployee(Employee employee){
    Session session = factory.openSession();
    Transaction tx = null;
    Integer employeeID = null;

    try {
        tx = session.beginTransaction();
        employeeID = (Integer) session.save(employee); 
        tx.commit();
    } catch (HibernateException e) {
        if (tx != null) tx.rollback();
        e.printStackTrace(); 
    } finally {
        session.close(); 
    }
    return employeeID;
}

```
### Spring Data JPA:
Spring Data JPA builds on JPA and Hibernate. It reduces code. We do not need to manage sessions or write queries for simple things. Spring handles it automatically.

- Example code using Spring Data JPA:
```
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
```
```
@Autowired
private EmployeeRepository employeeRepository;

@Transactional
public void addEmployee(Employee employee) {
    employeeRepository.save(employee);
}
```