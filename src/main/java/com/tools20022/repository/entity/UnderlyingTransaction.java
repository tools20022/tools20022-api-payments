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
import com.tools20022.repository.codeset.ExternalUnderlyingTradeTransactionTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reference information on a commercial obligation between the beneficiary and
 * applicant for which an undertaking is issued.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UnderlyingTransaction"
 * src="doc-files/UnderlyingTransaction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmUndertaking
 * UnderlyingTransaction.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmType
 * UnderlyingTransaction.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmIdentification
 * UnderlyingTransaction.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmIssueDate
 * UnderlyingTransaction.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmTenderClosingDate
 * UnderlyingTransaction.mmTenderClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmTotalAmount
 * UnderlyingTransaction.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmContractAmountPercentage
 * UnderlyingTransaction.mmContractAmountPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmCommercialTrade
 * UnderlyingTransaction.mmCommercialTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUnderlyingTransaction
 * Undertaking.mmUnderlyingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmRelatedUndertaking
 * CommercialTrade.mmRelatedUndertaking}</li>
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
 * "UnderlyingTransaction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reference information on a commercial obligation between the beneficiary and applicant for which an undertaking is issued."
 * </li>
 * </ul>
 */
public class UnderlyingTransaction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Undertaking undertaking;
	/**
	 * Undertaking issued to support a contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUnderlyingTransaction
	 * Undertaking.mmUnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking issued to support a contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking issued to support a contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.mmUnderlyingTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	protected ExternalUnderlyingTradeTransactionTypeCode type;
	/**
	 * Type of commercial obligation such as a tender, order, contract, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalUnderlyingTradeTransactionTypeCode
	 * ExternalUnderlyingTradeTransactionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of commercial obligation such as a tender, order, contract, etc."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of commercial obligation such as a tender, order, contract, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalUnderlyingTradeTransactionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UnderlyingTransaction.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identification;
	/**
	 * Identification of the commercial obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the commercial obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the commercial obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UnderlyingTransaction.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate issueDate;
	/**
	 * Date the commercial obligation was issued or awarded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the commercial obligation was issued or awarded."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIssueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date the commercial obligation was issued or awarded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UnderlyingTransaction.class.getMethod("getIssueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate tenderClosingDate;
	/**
	 * Date the tender closes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the tender closes."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTenderClosingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TenderClosingDate";
			definition = "Date the tender closes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UnderlyingTransaction.class.getMethod("getTenderClosingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount totalAmount;
	/**
	 * Amount of the commercial obligation.
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
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the commercial obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Amount of the commercial obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UnderlyingTransaction.class.getMethod("getTotalAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate contractAmountPercentage;
	/**
	 * Percentage of the underlying contract covered by the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractAmountPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the underlying contract covered by the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmContractAmountPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractAmountPercentage";
			definition = "Percentage of the underlying contract covered by the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UnderlyingTransaction.class.getMethod("getContractAmountPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CommercialTrade commercialTrade;
	/**
	 * Commercial trade for which an undertaking is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmRelatedUndertaking
	 * CommercialTrade.mmRelatedUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commercial trade for which an undertaking is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialTrade";
			definition = "Commercial trade for which an undertaking is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmRelatedUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction";
				definition = "Reference information on a commercial obligation between the beneficiary and applicant for which an undertaking is issued.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.mmUnderlyingTransaction, com.tools20022.repository.entity.CommercialTrade.mmRelatedUndertaking);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UnderlyingTransaction.mmUndertaking, com.tools20022.repository.entity.UnderlyingTransaction.mmType,
						com.tools20022.repository.entity.UnderlyingTransaction.mmIdentification, com.tools20022.repository.entity.UnderlyingTransaction.mmIssueDate,
						com.tools20022.repository.entity.UnderlyingTransaction.mmTenderClosingDate, com.tools20022.repository.entity.UnderlyingTransaction.mmTotalAmount,
						com.tools20022.repository.entity.UnderlyingTransaction.mmContractAmountPercentage, com.tools20022.repository.entity.UnderlyingTransaction.mmCommercialTrade);
			}

			@Override
			public Class<?> getInstanceClass() {
				return UnderlyingTransaction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public void setUndertaking(com.tools20022.repository.entity.Undertaking undertaking) {
		this.undertaking = undertaking;
	}

	public ExternalUnderlyingTradeTransactionTypeCode getType() {
		return type;
	}

	public void setType(ExternalUnderlyingTradeTransactionTypeCode type) {
		this.type = type;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public ISODate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
	}

	public ISODate getTenderClosingDate() {
		return tenderClosingDate;
	}

	public void setTenderClosingDate(ISODate tenderClosingDate) {
		this.tenderClosingDate = tenderClosingDate;
	}

	public CurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(CurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
	}

	public PercentageRate getContractAmountPercentage() {
		return contractAmountPercentage;
	}

	public void setContractAmountPercentage(PercentageRate contractAmountPercentage) {
		this.contractAmountPercentage = contractAmountPercentage;
	}

	public CommercialTrade getCommercialTrade() {
		return commercialTrade;
	}

	public void setCommercialTrade(com.tools20022.repository.entity.CommercialTrade commercialTrade) {
		this.commercialTrade = commercialTrade;
	}
}