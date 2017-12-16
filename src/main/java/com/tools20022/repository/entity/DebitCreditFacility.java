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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashBalance7;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the conditions for overdraft on the account or for positive
 * amounts.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DebitCreditFacility" src="doc-files/DebitCreditFacility.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCreditLine
 * DebitCreditFacility.mmCreditLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCashAccountInterest
 * DebitCreditFacility.mmCashAccountInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCreditDebitIndicator
 * DebitCreditFacility.mmCreditDebitIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Limit#mmRelatedDebitCreditFacility
 * Limit.mmRelatedDebitCreditFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedDebitCreditFacility
 * Interest.mmRelatedDebitCreditFacility}</li>
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
 * "DebitCreditFacility"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions for overdraft on the account or for positive amounts."
 * </li>
 * </ul>
 */
public class DebitCreditFacility extends CashAccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Limit creditLine;
	/**
	 * Credit or Debit limit applied to a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmRelatedDebitCreditFacility
	 * Limit.mmRelatedDebitCreditFacility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#mmCreditLine
	 * CashBalance7.mmCreditLine}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility
	 * DebitCreditFacility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit or Debit limit applied to a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCreditLine = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CashBalance7.mmCreditLine);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditLine";
			definition = "Credit or Debit limit applied to a cash account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Limit.mmRelatedDebitCreditFacility;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
		}
	};
	protected Interest cashAccountInterest;
	/**
	 * Interest that applies to a cash account at a particular moment in time,
	 * as per a contractual relationship.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedDebitCreditFacility
	 * Interest.mmRelatedDebitCreditFacility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility
	 * DebitCreditFacility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest that applies to a cash account at a particular moment in time, as per a contractual relationship."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccountInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccountInterest";
			definition = "Interest that applies to a cash account at a particular moment in time, as per a contractual relationship.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmRelatedDebitCreditFacility;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * Specifies if the line is a debit limit or a credit limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility
	 * DebitCreditFacility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies if the line is a debit limit or a credit limit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if the line is a debit limit or a credit limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DebitCreditFacility.class.getMethod("getCreditDebitIndicator", new Class[]{});
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
				name = "DebitCreditFacility";
				definition = "Specifies the conditions for overdraft on the account or for positive amounts.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Limit.mmRelatedDebitCreditFacility, com.tools20022.repository.entity.Interest.mmRelatedDebitCreditFacility);
				superType_lazy = () -> CashAccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DebitCreditFacility.mmCreditLine, com.tools20022.repository.entity.DebitCreditFacility.mmCashAccountInterest,
						com.tools20022.repository.entity.DebitCreditFacility.mmCreditDebitIndicator);
			}

			@Override
			public Class<?> getInstanceClass() {
				return DebitCreditFacility.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Limit getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(com.tools20022.repository.entity.Limit creditLine) {
		this.creditLine = creditLine;
	}

	public Interest getCashAccountInterest() {
		return cashAccountInterest;
	}

	public void setCashAccountInterest(com.tools20022.repository.entity.Interest cashAccountInterest) {
		this.cashAccountInterest = cashAccountInterest;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}
}