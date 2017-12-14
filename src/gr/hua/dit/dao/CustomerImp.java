package gr.hua.dit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Customer;

@Repository
public class CustomerImp implements CustomerDao {

	// inject the session factory
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public List<Customer> getCustomers() {
		// get current hybernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);

		// execute the query and get the results list
		List<Customer> customers = query.getResultList();

		// return results
		return customers;
	}

}
