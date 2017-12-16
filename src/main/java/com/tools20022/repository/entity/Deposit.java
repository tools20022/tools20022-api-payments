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
import com.tools20022.repository.codeset.DepositTypeCode;
import com.tools20022.repository.entity.Money;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashCollateral5;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * An arrangement in which a lender gives money or property to a borrower, and
 * the borrower agrees to return the property or repay the money, usually along
 * with interest, at some future point(s) in time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Deposit" src="doc-files/Deposit.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Money Money}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Deposit#mmDepositType
 * Deposit.mmDepositType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deposit#mmInterest
 * Deposit.mmInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmDeposit
 * Interest.mmDeposit}</li>
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
 * "Deposit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An arrangement in which a lender gives money or property to a borrower, and the borrower agrees to return the property or repay the money, usually along with interest, at some future point(s) in time."
 * </li>
 * </ul>
 */
public class Deposit extends Money {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DepositTypeCode depositType;
	/**
	 * Specifies whether the deposit is fixed term or call/notice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DepositTypeCode
	 * DepositTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmDepositType
	 * CashCollateral5.mmDepositType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deposit
	 * Deposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the deposit is fixed term or call/notice."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDepositType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashCollateral5.mmDepositType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deposit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositType";
			definition = "Specifies whether the deposit is fixed term or call/notice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DepositTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Deposit.class.getMethod("getDepositType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * Interest amount linked to a deposit. It is derived from the relationship
	 * between AssetHolding and Interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmDeposit
	 * Interest.mmDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deposit
	 * Deposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount linked to a deposit. It is derived from the relationship between AssetHolding and Interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deposit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest amount linked to a deposit. It is derived from the relationship between AssetHolding and Interest.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmDeposit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Deposit";
				definition = "An arrangement in which a lender gives money or property to a borrower, and the borrower agrees to return the property or repay the money, usually along with interest, at some future point(s) in time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Interest.mmDeposit);
				superType_lazy = () -> Money.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Deposit.mmDepositType, com.tools20022.repository.entity.Deposit.mmInterest);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Deposit.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DepositTypeCode getDepositType() {
		return depositType;
	}

	public void setDepositType(DepositTypeCode depositType) {
		this.depositType = depositType;
	}

	public List<Interest> getInterest() {
		return interest;
	}

	public void setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = interest;
	}
}