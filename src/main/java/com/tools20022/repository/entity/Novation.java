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
import com.tools20022.repository.codeset.NovationStatusCode;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Act of either replacing an obligation to perform with a new obligation, or
 * replacing a party to an agreement with a new party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Novation" src="doc-files/Novation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Novation#mmSecuritiesClearing
 * Novation.mmSecuritiesClearing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Novation#mmNovationStatus
 * Novation.mmNovationStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmNovation
 * SecuritiesClearing.mmNovation}</li>
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
 * "Novation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Act of either replacing an obligation to perform with a new obligation, or replacing a party to an agreement with a new party."
 * </li>
 * </ul>
 */
public class Novation extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesClearing securitiesClearing;
	/**
	 * Clearing process to which the novation is related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmNovation
	 * SecuritiesClearing.mmNovation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesClearing
	 * SecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Novation
	 * Novation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing process to which the novation is related."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesClearing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Novation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesClearing";
			definition = "Clearing process to which the novation is related.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmNovation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
		}
	};
	protected NovationStatusCode novationStatus;
	/**
	 * Provides the novation status for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NovationStatusCode
	 * NovationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Novation
	 * Novation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NovationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the novation status for the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNovationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Novation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NovationStatus";
			definition = "Provides the novation status for the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NovationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Novation.class.getMethod("getNovationStatus", new Class[]{});
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
				name = "Novation";
				definition = "Act of either replacing an obligation to perform with a new obligation, or replacing a party to an agreement with a new party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesClearing.mmNovation);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Novation.mmSecuritiesClearing, com.tools20022.repository.entity.Novation.mmNovationStatus);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Novation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesClearing getSecuritiesClearing() {
		return securitiesClearing;
	}

	public void setSecuritiesClearing(com.tools20022.repository.entity.SecuritiesClearing securitiesClearing) {
		this.securitiesClearing = securitiesClearing;
	}

	public NovationStatusCode getNovationStatus() {
		return novationStatus;
	}

	public void setNovationStatus(NovationStatusCode novationStatus) {
		this.novationStatus = novationStatus;
	}
}