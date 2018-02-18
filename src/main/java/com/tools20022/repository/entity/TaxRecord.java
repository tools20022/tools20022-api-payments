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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Record of tax details.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TaxRecord" src="doc-files/TaxRecord.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmTax
 * TaxRecord.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmTaxRecordType
 * TaxRecord.mmTaxRecordType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmCategory
 * TaxRecord.mmCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmStatus
 * TaxRecord.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmFormsCode
 * TaxRecord.mmFormsCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmPeriod
 * TaxRecord.mmPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmAmount
 * TaxRecord.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmCategoryDescription
 * TaxRecord.mmCategoryDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmRecord Tax.mmRecord}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmTaxRecord
 * TaxPeriod.mmTaxRecord}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1 TaxRecord1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1
 * ServiceTaxDesignation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax1
 * BillingServicesTax1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax2
 * BillingServicesTax2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax3
 * BillingServicesTax3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxRecord"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Record of tax details."</li>
 * </ul>
 */
public class TaxRecord {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Tax tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmRecord
	 * Tax.mmRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmTaxAmount
	 * TaxRecord1.mmTaxAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax for which tax record information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TaxRecord1.mmTaxAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax for which tax record information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmRecord;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected Max35Text taxRecordType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmType
	 * TaxRecord1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRecordType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "High level code to identify the type of tax details."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxRecordType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxRecord1.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRecordType";
			definition = "High level code to identify the type of tax details.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxRecord.class.getMethod("getTaxRecordType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text category;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmCategory
	 * TaxRecord1.mmCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the tax that is being paid, including specific representation (code) required by the tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCategory = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxRecord1.mmCategory);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Category";
			definition = "Description of the tax that is being paid, including specific representation (code) required by the tax authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxRecord.class.getMethod("getCategory", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmDebtorStatus
	 * TaxRecord1.mmDebtorStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code provided by local authority to identify the status of the party that has drawn up the settlement document."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxRecord1.mmDebtorStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Code provided by local authority to identify the status of the party that has drawn up the settlement document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxRecord.class.getMethod("getStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text formsCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmFormsCode
	 * TaxRecord1.mmFormsCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormsCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code to identify on which template the tax report is to be provided"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFormsCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxRecord1.mmFormsCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FormsCode";
			definition = "Code to identify on which template the tax report is to be provided";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxRecord.class.getMethod("getFormsCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TaxPeriod period;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxPeriod#mmTaxRecord
	 * TaxPeriod.mmTaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxPeriod TaxPeriod}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmPeriod
	 * TaxRecord1.mmPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of time details related to the tax payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TaxRecord1.mmPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Period";
			definition = "Period of time details related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmTaxRecord;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax1#mmHostAmount
	 * BillingServicesTax1.mmHostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax1#mmPricingAmount
	 * BillingServicesTax1.mmPricingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax2#mmPricingAmount
	 * BillingServicesTax2.mmPricingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod3#mmServiceTaxPriceAmount
	 * BillingMethod3.mmServiceTaxPriceAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the tax record."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BillingServicesTax1.mmHostAmount, BillingServicesTax1.mmPricingAmount, BillingServicesTax2.mmPricingAmount, BillingMethod3.mmServiceTaxPriceAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the tax record.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxRecord.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text categoryDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the tax that is being paid, including specific representation required by taxing authority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCategoryDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CategoryDescription";
			definition = "Description of the tax that is being paid, including specific representation required by taxing authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxRecord.class.getMethod("getCategoryDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRecord";
				definition = "Record of tax details.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tax.mmRecord, com.tools20022.repository.entity.TaxPeriod.mmTaxRecord);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxRecord.mmTax, com.tools20022.repository.entity.TaxRecord.mmTaxRecordType, com.tools20022.repository.entity.TaxRecord.mmCategory,
						com.tools20022.repository.entity.TaxRecord.mmStatus, com.tools20022.repository.entity.TaxRecord.mmFormsCode, com.tools20022.repository.entity.TaxRecord.mmPeriod, com.tools20022.repository.entity.TaxRecord.mmAmount,
						com.tools20022.repository.entity.TaxRecord.mmCategoryDescription);
				derivationComponent_lazy = () -> Arrays.asList(TaxRecord1.mmObject(), ServiceTaxDesignation1.mmObject(), BillingServicesTax1.mmObject(), BillingServicesTax2.mmObject(), BillingServicesTax3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TaxRecord.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Tax> getTax() {
		return tax == null ? Optional.empty() : Optional.of(tax);
	}

	public TaxRecord setTax(com.tools20022.repository.entity.Tax tax) {
		this.tax = tax;
		return this;
	}

	public Max35Text getTaxRecordType() {
		return taxRecordType;
	}

	public TaxRecord setTaxRecordType(Max35Text taxRecordType) {
		this.taxRecordType = Objects.requireNonNull(taxRecordType);
		return this;
	}

	public Max35Text getCategory() {
		return category;
	}

	public TaxRecord setCategory(Max35Text category) {
		this.category = Objects.requireNonNull(category);
		return this;
	}

	public Max35Text getStatus() {
		return status;
	}

	public TaxRecord setStatus(Max35Text status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Max35Text getFormsCode() {
		return formsCode;
	}

	public TaxRecord setFormsCode(Max35Text formsCode) {
		this.formsCode = Objects.requireNonNull(formsCode);
		return this;
	}

	public TaxPeriod getPeriod() {
		return period;
	}

	public TaxRecord setPeriod(com.tools20022.repository.entity.TaxPeriod period) {
		this.period = Objects.requireNonNull(period);
		return this;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public TaxRecord setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Max35Text getCategoryDescription() {
		return categoryDescription;
	}

	public TaxRecord setCategoryDescription(Max35Text categoryDescription) {
		this.categoryDescription = Objects.requireNonNull(categoryDescription);
		return this;
	}
}