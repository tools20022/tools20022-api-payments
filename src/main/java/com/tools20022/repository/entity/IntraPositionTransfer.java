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
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Transfer of securities from one sub-balance to another or from one balance
 * status to another.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IntraPositionTransfer"
 * src="doc-files/IntraPositionTransfer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmReservation
 * IntraPositionTransfer.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmCollateralAmount
 * IntraPositionTransfer.mmCollateralAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmSecuritiesBalance
 * IntraPositionTransfer.mmSecuritiesBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmRelatedIntraPositionTransfer
 * Reservation.mmRelatedIntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmRelatedIntraPositionTransfer
 * SecuritiesBalance.mmRelatedIntraPositionTransfer}</li>
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
 * "IntraPositionTransfer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transfer of securities from one sub-balance to another or from one balance status to another."
 * </li>
 * </ul>
 */
public class IntraPositionTransfer extends SecuritiesTransfer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Reservation> reservation;
	/**
	 * Quantity of securities set aside by a party for specific purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reservation#mmRelatedIntraPositionTransfer
	 * Reservation.mmRelatedIntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reservation
	 * Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities set aside by a party for specific purpose."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReservation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Quantity of securities set aside by a party for specific purpose.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reservation.mmRelatedIntraPositionTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
		}
	};
	protected CurrencyAndAmount collateralAmount;
	/**
	 * Value of the collateral available for the delivery settlement process.
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
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral available for the delivery settlement process."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollateralAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralAmount";
			definition = "Value of the collateral available for the delivery settlement process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IntraPositionTransfer.class.getMethod("getCollateralAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesBalance securitiesBalance;
	/**
	 * Specifies the securities balance or sub-balance from/to which the
	 * securities are transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmRelatedIntraPositionTransfer
	 * SecuritiesBalance.mmRelatedIntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities balance or sub-balance from/to which the securities are transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Specifies the securities balance or sub-balance from/to which the securities are transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmRelatedIntraPositionTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntraPositionTransfer";
				definition = "Transfer of securities from one sub-balance to another or from one balance status to another.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reservation.mmRelatedIntraPositionTransfer, com.tools20022.repository.entity.SecuritiesBalance.mmRelatedIntraPositionTransfer);
				superType_lazy = () -> SecuritiesTransfer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IntraPositionTransfer.mmReservation, com.tools20022.repository.entity.IntraPositionTransfer.mmCollateralAmount,
						com.tools20022.repository.entity.IntraPositionTransfer.mmSecuritiesBalance);
			}

			@Override
			public Class<?> getInstanceClass() {
				return IntraPositionTransfer.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<com.tools20022.repository.entity.Reservation> reservation) {
		this.reservation = reservation;
	}

	public CurrencyAndAmount getCollateralAmount() {
		return collateralAmount;
	}

	public void setCollateralAmount(CurrencyAndAmount collateralAmount) {
		this.collateralAmount = collateralAmount;
	}

	public SecuritiesBalance getSecuritiesBalance() {
		return securitiesBalance;
	}

	public void setSecuritiesBalance(com.tools20022.repository.entity.SecuritiesBalance securitiesBalance) {
		this.securitiesBalance = securitiesBalance;
	}
}