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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Name by which an organisation is known and which is usually used to identify
 * that organisation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="OrganisationName" src="doc-files/OrganisationName.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PartyName
 * PartyName}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmOrganisation
 * OrganisationName.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmLegalName
 * OrganisationName.mmLegalName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmTradingName
 * OrganisationName.mmTradingName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmShortName
 * OrganisationName.mmShortName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisationName
 * OrganisationIdentification.mmOrganisationName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FullLegalNameModification1
 * FullLegalNameModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradingNameModification1
 * TradingNameModification1}</li>
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
 * "OrganisationName"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Name by which an organisation is known and which is usually used to identify that organisation."
 * </li>
 * </ul>
 */
public class OrganisationName extends PartyName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected OrganisationIdentification organisation;
	/**
	 * Organisation identification which contains a name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisationName
	 * OrganisationIdentification.mmOrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation identification which contains a name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrganisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmOrganisationName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
		}
	};
	protected Max35Text legalName;
	/**
	 * Official name under which an organisation is registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmFullLegalName
	 * Organisation12.mmFullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation14#mmFullLegalName
	 * Organisation14.mmFullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FullLegalNameModification1#mmFullLegalName
	 * FullLegalNameModification1.mmFullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmFullLegalName
	 * OrganisationModification1.mmFullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmLegalName
	 * PartyIdentification58.mmLegalName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Official name under which an organisation is registered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLegalName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation12.mmFullLegalName, Organisation14.mmFullLegalName, FullLegalNameModification1.mmFullLegalName, OrganisationModification1.mmFullLegalName, PartyIdentification58.mmLegalName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalName";
			definition = "Official name under which an organisation is registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrganisationName.class.getMethod("getLegalName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text tradingName;
	/**
	 * Name used by a business for commercial purposes, although its registered
	 * legal name, used for contracts and other formal situations, may be
	 * another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmTradingName
	 * Organisation12.mmTradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingNameModification1#mmTradingName
	 * TradingNameModification1.mmTradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmTradingName
	 * OrganisationModification1.mmTradingName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradingName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation12.mmTradingName, TradingNameModification1.mmTradingName, OrganisationModification1.mmTradingName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingName";
			definition = "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrganisationName.class.getMethod("getTradingName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text shortName;
	/**
	 * Specifies the short name of the organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32#mmShortName
	 * GenericIdentification32.mmShortName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the short name of the organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmShortName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(GenericIdentification32.mmShortName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShortName";
			definition = "Specifies the short name of the organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrganisationName.class.getMethod("getShortName", new Class[]{});
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
				name = "OrganisationName";
				definition = "Name by which an organisation is known and which is usually used to identify that organisation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationIdentification.mmOrganisationName);
				superType_lazy = () -> PartyName.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationName.mmOrganisation, com.tools20022.repository.entity.OrganisationName.mmLegalName,
						com.tools20022.repository.entity.OrganisationName.mmTradingName, com.tools20022.repository.entity.OrganisationName.mmShortName);
				derivationComponent_lazy = () -> Arrays.asList(FullLegalNameModification1.mmObject(), TradingNameModification1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return OrganisationName.class;
			}
		});
		return mmObject_lazy.get();
	}

	public OrganisationIdentification getOrganisation() {
		return organisation;
	}

	public void setOrganisation(com.tools20022.repository.entity.OrganisationIdentification organisation) {
		this.organisation = organisation;
	}

	public Max35Text getLegalName() {
		return legalName;
	}

	public void setLegalName(Max35Text legalName) {
		this.legalName = legalName;
	}

	public Max350Text getTradingName() {
		return tradingName;
	}

	public void setTradingName(Max350Text tradingName) {
		this.tradingName = tradingName;
	}

	public Max35Text getShortName() {
		return shortName;
	}

	public void setShortName(Max35Text shortName) {
		this.shortName = shortName;
	}
}