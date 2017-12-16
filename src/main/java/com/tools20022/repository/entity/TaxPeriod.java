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
import com.tools20022.repository.codeset.TaxRecordPeriodCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TaxPeriod1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Period of time details related to the tax payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TaxPeriod" src="doc-files/TaxPeriod.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmTaxRecord
 * TaxPeriod.mmTaxRecord}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmYear
 * TaxPeriod.mmYear}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmType
 * TaxPeriod.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmFromToDate
 * TaxPeriod.mmFromToDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmEndOfFiscalYear
 * TaxPeriod.mmEndOfFiscalYear}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTaxPeriod
 * DateTimePeriod.mmTaxPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmPeriod
 * TaxRecord.mmPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxPeriod1 TaxPeriod1}</li>
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
 * "TaxPeriod"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Period of time details related to the tax payment."</li>
 * </ul>
 */
public class TaxPeriod {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TaxRecord taxRecord;
	/**
	 * Tax record for which a period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmPeriod
	 * TaxRecord.mmPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxPeriod
	 * TaxPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRecord"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax record for which a period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxRecord = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRecord";
			definition = "Tax record for which a period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
		}
	};
	protected ISODate year;
	/**
	 * Year related to the tax payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxPeriod1#mmYear
	 * TaxPeriod1.mmYear}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxPeriod
	 * TaxPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Year"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year related to the tax payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmYear = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxPeriod1.mmYear);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Year";
			definition = "Year related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxPeriod.class.getMethod("getYear", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TaxRecordPeriodCode type;
	/**
	 * Identification of the period related to the tax payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxPeriod1#mmType
	 * TaxPeriod1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxPeriod
	 * TaxPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the period related to the tax payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxPeriod1.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Identification of the period related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxRecordPeriodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxPeriod.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod fromToDate;
	/**
	 * Range of time between a start date and an end date for which the tax
	 * report is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTaxPeriod
	 * DateTimePeriod.mmTaxPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxPeriod1#mmFromToDate
	 * TaxPeriod1.mmFromToDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxPeriod
	 * TaxPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Range of time between a start date and an end date for which the tax report is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFromToDate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TaxPeriod1.mmFromToDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for which the tax report is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmTaxPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected ISODate endOfFiscalYear;
	/**
	 * Date on which the fiscal year is closed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxPeriod
	 * TaxPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfFiscalYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the fiscal year is closed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEndOfFiscalYear = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndOfFiscalYear";
			definition = "Date on which the fiscal year is closed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TaxPeriod.class.getMethod("getEndOfFiscalYear", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxPeriod";
				definition = "Period of time details related to the tax payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmTaxPeriod, com.tools20022.repository.entity.TaxRecord.mmPeriod);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxPeriod.mmTaxRecord, com.tools20022.repository.entity.TaxPeriod.mmYear, com.tools20022.repository.entity.TaxPeriod.mmType,
						com.tools20022.repository.entity.TaxPeriod.mmFromToDate, com.tools20022.repository.entity.TaxPeriod.mmEndOfFiscalYear);
				derivationComponent_lazy = () -> Arrays.asList(TaxPeriod1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TaxPeriod.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TaxRecord getTaxRecord() {
		return taxRecord;
	}

	public void setTaxRecord(com.tools20022.repository.entity.TaxRecord taxRecord) {
		this.taxRecord = taxRecord;
	}

	public ISODate getYear() {
		return year;
	}

	public void setYear(ISODate year) {
		this.year = year;
	}

	public TaxRecordPeriodCode getType() {
		return type;
	}

	public void setType(TaxRecordPeriodCode type) {
		this.type = type;
	}

	public DateTimePeriod getFromToDate() {
		return fromToDate;
	}

	public void setFromToDate(com.tools20022.repository.entity.DateTimePeriod fromToDate) {
		this.fromToDate = fromToDate;
	}

	public ISODate getEndOfFiscalYear() {
		return endOfFiscalYear;
	}

	public void setEndOfFiscalYear(ISODate endOfFiscalYear) {
		this.endOfFiscalYear = endOfFiscalYear;
	}
}