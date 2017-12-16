/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Valuation information of the portfolio.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PortfolioValuation" src="doc-files/PortfolioValuation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmTotalPortfolioValue
 * PortfolioValuation.mmTotalPortfolioValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmTotalBookValue
 * PortfolioValuation.mmTotalBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmTotalReceipts
 * PortfolioValuation.mmTotalReceipts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmTotalDisbursements
 * PortfolioValuation.mmTotalDisbursements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmIncomeReceived
 * PortfolioValuation.mmIncomeReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmExpensesPaid
 * PortfolioValuation.mmExpensesPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmPortfolio
 * PortfolioValuation.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmValuationPeriod
 * PortfolioValuation.mmValuationPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPortfolioValuation
 * DateTimePeriod.mmRelatedPortfolioValuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmValuation
 * Portfolio.mmValuation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PortfolioValuation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Valuation information of the portfolio."</li>
 * </ul>
 */
public class PortfolioValuation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount totalPortfolioValue;
	/**
	 * Total value of the portfolio. It is derived from the sum of the values of
	 * the asset holdings, of the unrealised gain/loss and of the liabilities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalPortfolioValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of the portfolio. It is derived from the sum of the values of the asset holdings, of the unrealised gain/loss and of the liabilities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalPortfolioValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalPortfolioValue";
			definition = "Total value of the portfolio. It is derived from the sum of the values of the asset holdings, of the unrealised gain/loss and of the liabilities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioValuation.class.getMethod("getTotalPortfolioValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount totalBookValue;
	/**
	 * Net asset on balance sheet - total portfolio value minus or plus the
	 * unrealised gain or loss.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalBookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset on balance sheet - total portfolio value minus or plus the unrealised gain or loss."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalBookValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalBookValue";
			definition = "Net asset on balance sheet - total portfolio value minus or plus the unrealised gain or loss.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioValuation.class.getMethod("getTotalBookValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount totalReceipts;
	/**
	 * Total receipts attributable to the portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReceipts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total receipts attributable to the portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalReceipts = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalReceipts";
			definition = "Total receipts attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioValuation.class.getMethod("getTotalReceipts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount totalDisbursements;
	/**
	 * Total disbursements attributable to the portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDisbursements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total disbursements attributable to the portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalDisbursements = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalDisbursements";
			definition = "Total disbursements attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioValuation.class.getMethod("getTotalDisbursements", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount incomeReceived;
	/**
	 * Income attributable to the portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income attributable to the portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIncomeReceived = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncomeReceived";
			definition = "Income attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioValuation.class.getMethod("getIncomeReceived", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount expensesPaid;
	/**
	 * Expenses attributable to the portfolio
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpensesPaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expenses attributable to the portfolio"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExpensesPaid = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpensesPaid";
			definition = "Expenses attributable to the portfolio";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioValuation.class.getMethod("getExpensesPaid", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Portfolio portfolio;
	/**
	 * Specifies the portfolio for which a valuation is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmValuation
	 * Portfolio.mmValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the portfolio for which a valuation is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPortfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Specifies the portfolio for which a valuation is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.mmValuation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DateTimePeriod> valuationPeriod;
	/**
	 * Period for which the valuation is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPortfolioValuation
	 * DateTimePeriod.mmRelatedPortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period for which the valuation is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValuationPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuationPeriod";
			definition = "Period for which the valuation is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedPortfolioValuation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PortfolioValuation";
				definition = "Valuation information of the portfolio.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmRelatedPortfolioValuation, com.tools20022.repository.entity.Portfolio.mmValuation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioValuation.mmTotalPortfolioValue, com.tools20022.repository.entity.PortfolioValuation.mmTotalBookValue,
						com.tools20022.repository.entity.PortfolioValuation.mmTotalReceipts, com.tools20022.repository.entity.PortfolioValuation.mmTotalDisbursements, com.tools20022.repository.entity.PortfolioValuation.mmIncomeReceived,
						com.tools20022.repository.entity.PortfolioValuation.mmExpensesPaid, com.tools20022.repository.entity.PortfolioValuation.mmPortfolio, com.tools20022.repository.entity.PortfolioValuation.mmValuationPeriod);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PortfolioValuation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getTotalPortfolioValue() {
		return totalPortfolioValue;
	}

	public void setTotalPortfolioValue(CurrencyAndAmount totalPortfolioValue) {
		this.totalPortfolioValue = totalPortfolioValue;
	}

	public CurrencyAndAmount getTotalBookValue() {
		return totalBookValue;
	}

	public void setTotalBookValue(CurrencyAndAmount totalBookValue) {
		this.totalBookValue = totalBookValue;
	}

	public CurrencyAndAmount getTotalReceipts() {
		return totalReceipts;
	}

	public void setTotalReceipts(CurrencyAndAmount totalReceipts) {
		this.totalReceipts = totalReceipts;
	}

	public CurrencyAndAmount getTotalDisbursements() {
		return totalDisbursements;
	}

	public void setTotalDisbursements(CurrencyAndAmount totalDisbursements) {
		this.totalDisbursements = totalDisbursements;
	}

	public CurrencyAndAmount getIncomeReceived() {
		return incomeReceived;
	}

	public void setIncomeReceived(CurrencyAndAmount incomeReceived) {
		this.incomeReceived = incomeReceived;
	}

	public CurrencyAndAmount getExpensesPaid() {
		return expensesPaid;
	}

	public void setExpensesPaid(CurrencyAndAmount expensesPaid) {
		this.expensesPaid = expensesPaid;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(com.tools20022.repository.entity.Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public List<DateTimePeriod> getValuationPeriod() {
		return valuationPeriod;
	}

	public void setValuationPeriod(List<com.tools20022.repository.entity.DateTimePeriod> valuationPeriod) {
		this.valuationPeriod = valuationPeriod;
	}
}