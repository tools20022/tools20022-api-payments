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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.msg.FullLegalNameModification1;
import com.tools20022.repository.msg.TradingNameModification1;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#Organisation
 * OrganisationName.Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationName#LegalName
 * OrganisationName.LegalName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#TradingName
 * OrganisationName.TradingName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationName#ShortName
 * OrganisationName.ShortName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#OrganisationName
 * OrganisationIdentification.OrganisationName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PartyName
 * PartyName}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Organisation identification which contains a name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#OrganisationName
	 * OrganisationIdentification.OrganisationName}</li>
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
	public static final MMBusinessAssociationEnd Organisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> OrganisationName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation identification which contains a name.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> OrganisationIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.OrganisationName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.Organisation12#FullLegalName
	 * Organisation12.FullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation14#FullLegalName
	 * Organisation14.FullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FullLegalNameModification1#FullLegalName
	 * FullLegalNameModification1.FullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#FullLegalName
	 * OrganisationModification1.FullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#LegalName
	 * PartyIdentification58.LegalName}</li>
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
	public static final MMBusinessAttribute LegalName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation12.FullLegalName, com.tools20022.repository.msg.Organisation14.FullLegalName,
					com.tools20022.repository.msg.FullLegalNameModification1.FullLegalName, com.tools20022.repository.msg.OrganisationModification1.FullLegalName, com.tools20022.repository.msg.PartyIdentification58.LegalName);
			elementContext_lazy = () -> OrganisationName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalName";
			definition = "Official name under which an organisation is registered.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation12#TradingName
	 * Organisation12.TradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingNameModification1#TradingName
	 * TradingNameModification1.TradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#TradingName
	 * OrganisationModification1.TradingName}</li>
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
	public static final MMBusinessAttribute TradingName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation12.TradingName, com.tools20022.repository.msg.TradingNameModification1.TradingName,
					com.tools20022.repository.msg.OrganisationModification1.TradingName);
			elementContext_lazy = () -> OrganisationName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingName";
			definition = "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32#ShortName
	 * GenericIdentification32.ShortName}</li>
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
	public static final MMBusinessAttribute ShortName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification32.ShortName);
			elementContext_lazy = () -> OrganisationName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortName";
			definition = "Specifies the short name of the organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrganisationName";
				definition = "Name by which an organisation is known and which is usually used to identify that organisation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationIdentification.OrganisationName);
				superType_lazy = () -> PartyName.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationName.Organisation, com.tools20022.repository.entity.OrganisationName.LegalName, com.tools20022.repository.entity.OrganisationName.TradingName,
						com.tools20022.repository.entity.OrganisationName.ShortName);
				derivationComponent_lazy = () -> Arrays.asList(FullLegalNameModification1.mmObject(), TradingNameModification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}