package br.com.erudio.querybuilder;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class QueryBuilderTest {
	
	PagedSearchVO<City> dto = new PagedSearchVO<City>();
	QueryBuilder<City> queryBuilder = new QueryBuilder<City>();
	
	@Before
	public void setup() {
		dto = mockDTO();	
	}
	
	@Test
	public void getBaseSelectTest() {
		String baseSelect = "select p from City p ";
		assertEquals(queryBuilder.withVO(dto).getBaseSelect("p", "City"), baseSelect);
	}
	
	@Test
	public void getStartTest() {
		assertEquals(queryBuilder.withVO(dto).getStart(), (Integer)0);
	}
	
	@Test
	public void getBaseSelectCount() {
		String baseSelect = "select count(*) from City p ";
		assertEquals(queryBuilder.withVO(dto).getBaseSelectCount("p", "City"), baseSelect);
	}
	
	@Test
	public void getWhereAndParametersTest() {
		String whereClause = " where p.phone = :phone and p.name = :name and p.email = :email and 1 = 1 ";
		assertEquals(whereClause, queryBuilder.withVO(dto).getWhereAndParameters("p"));
	}
	
	@Test
	public void getWhereAndParametersWithBlankStringKeyTest() {
		Map<String, Object> filters = mockFilters();
		filters.put("", "LEANDRO");
		dto.setFilters(filters);
		String whereClause = " where p.phone = :phone and p.name = :name and p.email = :email and 1 = 1 ";
		assertEquals(queryBuilder.withVO(dto).getWhereAndParameters("p"), whereClause);
	}

	@Test
	public void getWhereAndParametersWithBlankStringValueTest() {
		Map<String, Object> filters = new HashMap<String, Object>();
		filters.put("name", "");
		dto.setFilters(filters);
		String whereClause = " where 1 = 1 ";
		assertEquals(queryBuilder.withVO(dto).getWhereAndParameters("p"), whereClause);
	}
	
	@Test
	public void getHQLQueryTest() {
		String selectWithParameters = "select p from City p"
				+ "  where p.phone = :phone and"
				+ " p.name = :name and"
				+ " p.email = :email and 1 = 1 "
				+ " order by p.name asc";
		assertEquals(selectWithParameters, queryBuilder.withVO(dto).getHQLQuery("p", "City"));
	}
	
	@Test
	public void getOrderByTest() {
		assertEquals(queryBuilder.withVO(dto).getOrderBy("p"), " order by p.name asc");
	}
	
	@Test
	public void getPageSizeTest() {
		assertEquals(dto.getPageSize(), (Integer)10);
	}
	
	@Test
	public void getCurrentPageTest() {
		assertEquals(dto.getCurrentPage(), (Integer)1);
	}
	
	@Test
	public void getPageSizeNullTest() {
		dto.setPageSize(null);
		assertEquals(dto.getPageSize(), (Integer)0);
	}
	
	@Test
	public void getCurrentPageNullTest() {
		dto.setCurrentPage(null);
		assertEquals(dto.getCurrentPage(), (Integer)0);
	}
	
	public PagedSearchVO<City> mockDTO(){
		dto.setCurrentPage(1);
		dto.setPageSize(10);
		dto.setSortFields("name");
		dto.setSortDirections("asc");
		dto.setFilters(mockFilters());
		return dto;
	}

	private Map<String, Object> mockFilters() {
		Map<String, Object> filters = new HashMap<String, Object>();
		filters.put("name", "LEANDRO");
		filters.put("email", "a@b.c");
		filters.put("phone", "12345678998");
		filters.put("cpf", null);
		filters.put("religion", null);
		filters.put("cpf", null);
		filters.put(null, "COSTA");
		return filters;
	}
}