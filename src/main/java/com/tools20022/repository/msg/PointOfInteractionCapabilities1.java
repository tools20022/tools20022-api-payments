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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.CardDataReading1Code;
import com.tools20022.repository.codeset.CardholderVerificationCapability1Code;
import com.tools20022.repository.codeset.OnLineCapability1Code;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.entity.PointOfInteraction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Capabilities of the POI performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#CardReadingCapabilities
 * PointOfInteractionCapabilities1.CardReadingCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#CardholderVerificationCapabilities
 * PointOfInteractionCapabilities1.CardholderVerificationCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#OnLineCapabilities
 * PointOfInteractionCapabilities1.OnLineCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#DisplayCapabilities
 * PointOfInteractionCapabilities1.DisplayCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#PrintLineWidth
 * PointOfInteractionCapabilities1.PrintLineWidth}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PointOfInteraction
 * PointOfInteraction}</li>
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
 * "PointOfInteractionCapabilities1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Capabilities of the POI performing the transaction."</li>
 * </ul>
 */
public class PointOfInteractionCapabilities1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card reading capabilities of the POI performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#CardReadingCapabilities
	 * PointOfInteraction.CardReadingCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1
	 * PointOfInteractionCapabilities1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardRdngCpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardReadingCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card reading capabilities of the POI performing the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CardReadingCapabilities = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.CardReadingCapabilities;
			isDerived = false;
			xmlTag = "CardRdngCpblties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardReadingCapabilities";
			definition = "Card reading capabilities of the POI performing the transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> CardDataReading1Code.mmObject();
		}
	};
	/**
	 * Cardholder verification capabilities of the POI performing the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#CardholderVerificationCapabilities
	 * PointOfInteraction.CardholderVerificationCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1
	 * PointOfInteractionCapabilities1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrVrfctnCpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderVerificationCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cardholder verification capabilities of the POI performing the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CardholderVerificationCapabilities = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.CardholderVerificationCapabilities;
			isDerived = false;
			xmlTag = "CrdhldrVrfctnCpblties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderVerificationCapabilities";
			definition = "Cardholder verification capabilities of the POI performing the transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	/**
	 * On-line and off-line capabilities of the POI.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapability1Code
	 * OnLineCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#OnLineCapabilities
	 * PointOfInteraction.OnLineCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1
	 * PointOfInteractionCapabilities1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLineCpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On-line and off-line capabilities of the POI."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OnLineCapabilities = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.OnLineCapabilities;
			isDerived = false;
			xmlTag = "OnLineCpblties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineCapabilities";
			definition = "On-line and off-line capabilities of the POI.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> OnLineCapability1Code.mmObject();
		}
	};
	/**
	 * Capabilities of the display components performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities1
	 * DisplayCapabilities1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#DisplayCapabilities
	 * PointOfInteraction.DisplayCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1
	 * PointOfInteractionCapabilities1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DispCpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capabilities of the display components performing the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DisplayCapabilities = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.DisplayCapabilities;
			isDerived = false;
			xmlTag = "DispCpblties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayCapabilities";
			definition = "Capabilities of the display components performing the transaction.";
			minOccurs = 0;
			complexType_lazy = () -> DisplayCapabilities1.mmObject();
		}
	};
	/**
	 * Number of columns of the printer component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#PrintLineWidth
	 * PointOfInteraction.PrintLineWidth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1
	 * PointOfInteractionCapabilities1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtLineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrintLineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of columns of the printer component."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PrintLineWidth = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.PrintLineWidth;
			isDerived = false;
			xmlTag = "PrtLineWidth";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrintLineWidth";
			definition = "Number of columns of the printer component.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionCapabilities1.CardReadingCapabilities,
						com.tools20022.repository.msg.PointOfInteractionCapabilities1.CardholderVerificationCapabilities, com.tools20022.repository.msg.PointOfInteractionCapabilities1.OnLineCapabilities,
						com.tools20022.repository.msg.PointOfInteractionCapabilities1.DisplayCapabilities, com.tools20022.repository.msg.PointOfInteractionCapabilities1.PrintLineWidth);
				trace_lazy = () -> PointOfInteraction.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionCapabilities1";
				definition = "Capabilities of the POI performing the transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}