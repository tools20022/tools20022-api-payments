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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.msg.PointOfInteraction1;
import com.tools20022.repository.msg.PointOfInteractionCapabilities1;
import com.tools20022.repository.msg.PointOfInteractionComponent1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Point of interaction (POI) is the entry point to a card payment system. It
 * could be a physical or logical card payment terminal containing software and
 * hardware components, it could be a payment system including a set of card
 * payment terminals linked to a local or remote server, or it could be just an
 * interface to make payments as telephone or Internet browser.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PointOfInteraction" src="doc-files/PointOfInteraction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#CardPaymentAcquiring
 * PointOfInteraction.CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#CardReadingCapabilities
 * PointOfInteraction.CardReadingCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#CardholderVerificationCapabilities
 * PointOfInteraction.CardholderVerificationCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#OnLineCapabilities
 * PointOfInteraction.OnLineCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#DisplayCapabilities
 * PointOfInteraction.DisplayCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#PrintLineWidth
 * PointOfInteraction.PrintLineWidth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#Component
 * PointOfInteraction.Component}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#ComponentIdentification
 * PointOfInteraction.ComponentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#GroupIdentifier
 * PointOfInteraction.GroupIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#LineWidth
 * PointOfInteraction.LineWidth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#NumberOfLines
 * PointOfInteraction.NumberOfLines}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PointOfInteraction#ErrorLog
 * PointOfInteraction.ErrorLog}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#ComponentVersionNumber
 * PointOfInteraction.ComponentVersionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#ControllingTerminalManagementSystem
 * PointOfInteraction.ControllingTerminalManagementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#PointOfInteraction
 * CardPaymentAcquiring.PointOfInteraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#ControlledPointOfInteraction
 * TerminalManagementSystem.ControlledPointOfInteraction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction1#Capabilities
 * PointOfInteraction1.Capabilities}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.System System}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1
 * PointOfInteractionCapabilities1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent1
 * PointOfInteractionComponent1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteraction1
 * PointOfInteraction1}</li>
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
 * "PointOfInteraction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Point of interaction (POI) is the entry point to a card payment system. It could be a physical or logical card payment terminal containing software and hardware components, it could be a payment system including a set of card payment terminals linked to a local or remote server, or it could be just an interface to make payments as telephone or Internet browser."
 * </li>
 * </ul>
 */
public class PointOfInteraction extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Process which uses the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#PointOfInteraction
	 * CardPaymentAcquiring.PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentAcquiring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Process which uses the point of interaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CardPaymentAcquiring = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Process which uses the point of interaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.PointOfInteraction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Card reading capabilities of the POI performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#CardReadingCapabilities
	 * PointOfInteractionCapabilities1.CardReadingCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardReadingCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card reading capabilities of the POI performing the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardReadingCapabilities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionCapabilities1.CardReadingCapabilities);
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardReadingCapabilities";
			definition = "Card reading capabilities of the POI performing the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardDataReadingCode.mmObject();
		}
	};
	/**
	 * Type of cardholder verification that could be performed during a
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#CardholderVerificationCapabilities
	 * PointOfInteractionCapabilities1.CardholderVerificationCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderVerificationCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of cardholder verification that could be performed during a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardholderVerificationCapabilities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionCapabilities1.CardholderVerificationCapabilities);
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderVerificationCapabilities";
			definition = "Type of cardholder verification that could be performed during a transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
		}
	};
	/**
	 * On-line and off-line capabilities of the POI.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode
	 * OnLineCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#OnLineCapabilities
	 * PointOfInteractionCapabilities1.OnLineCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On-line and off-line capabilities of the POI."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OnLineCapabilities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionCapabilities1.OnLineCapabilities);
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLineCapabilities";
			definition = "On-line and off-line capabilities of the POI.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OnLineCapabilityCode.mmObject();
		}
	};
	/**
	 * Display interfaces components.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#DisplayCapabilities
	 * PointOfInteractionCapabilities1.DisplayCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Display interfaces components."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DisplayCapabilities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionCapabilities1.DisplayCapabilities);
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisplayCapabilities";
			definition = "Display interfaces components.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UserInterfaceCode.mmObject();
		}
	};
	/**
	 * Number of columns of the printer component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#PrintLineWidth
	 * PointOfInteractionCapabilities1.PrintLineWidth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrintLineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of columns of the printer component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PrintLineWidth = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionCapabilities1.PrintLineWidth);
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrintLineWidth";
			definition = "Number of columns of the printer component.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	/**
	 * Type of components belonging to a POI.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction1#Component
	 * PointOfInteraction1.Component}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Component"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of components belonging to a POI."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Component = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction1.Component);
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Component";
			definition = "Type of components belonging to a POI.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> POIComponentTypeCode.mmObject();
		}
	};
	/**
	 * Identification of the POI component assigned by its provider.
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
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the POI component assigned by its provider."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ComponentIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ComponentIdentification";
			definition = "Identification of the POI component assigned by its provider.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifier assigned by the merchant identifying a set of POI terminals
	 * performing some categories of transactions.
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
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GroupIdentifier = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GroupIdentifier";
			definition = "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number of columns of the display component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of columns of the display component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LineWidth = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LineWidth";
			definition = "Number of columns of the display component.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	/**
	 * Number of lines of the display component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max2NumericText
	 * Max2NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfLines"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of lines of the display component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NumberOfLines = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfLines";
			definition = "Number of lines of the display component.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max2NumericText.mmObject();
		}
	};
	/**
	 * Error logging transferred by the point of interaction to the terminal
	 * management system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorLog"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Error logging transferred by the point of interaction to the terminal management system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ErrorLog = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ErrorLog";
			definition = "Error logging transferred by the point of interaction to the terminal management system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Identification of a version of component belonging to a given model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentVersionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a version of component belonging to a given model."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ComponentVersionNumber = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ComponentVersionNumber";
			definition = "Identification of a version of component belonging to a given model.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Terminal management system for which a point of interaction is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#ControlledPointOfInteraction
	 * TerminalManagementSystem.ControlledPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControllingTerminalManagementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system for which a point of interaction is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ControllingTerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ControllingTerminalManagementSystem";
			definition = "Terminal management system for which a point of interaction is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TerminalManagementSystem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.ControlledPointOfInteraction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PointOfInteraction";
				definition = "Point of interaction (POI) is the entry point to a card payment system. It could be a physical or logical card payment terminal containing software and hardware components, it could be a payment system including a set of card payment terminals linked to a local or remote server, or it could be just an interface to make payments as telephone or Internet browser.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentAcquiring.PointOfInteraction, com.tools20022.repository.entity.TerminalManagementSystem.ControlledPointOfInteraction);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction1.Capabilities);
				superType_lazy = () -> System.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PointOfInteraction.CardPaymentAcquiring, com.tools20022.repository.entity.PointOfInteraction.CardReadingCapabilities,
						com.tools20022.repository.entity.PointOfInteraction.CardholderVerificationCapabilities, com.tools20022.repository.entity.PointOfInteraction.OnLineCapabilities,
						com.tools20022.repository.entity.PointOfInteraction.DisplayCapabilities, com.tools20022.repository.entity.PointOfInteraction.PrintLineWidth, com.tools20022.repository.entity.PointOfInteraction.Component,
						com.tools20022.repository.entity.PointOfInteraction.ComponentIdentification, com.tools20022.repository.entity.PointOfInteraction.GroupIdentifier, com.tools20022.repository.entity.PointOfInteraction.LineWidth,
						com.tools20022.repository.entity.PointOfInteraction.NumberOfLines, com.tools20022.repository.entity.PointOfInteraction.ErrorLog, com.tools20022.repository.entity.PointOfInteraction.ComponentVersionNumber,
						com.tools20022.repository.entity.PointOfInteraction.ControllingTerminalManagementSystem);
				derivationComponent_lazy = () -> Arrays.asList(PointOfInteractionCapabilities1.mmObject(), PointOfInteractionComponent1.mmObject(), PointOfInteraction1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}