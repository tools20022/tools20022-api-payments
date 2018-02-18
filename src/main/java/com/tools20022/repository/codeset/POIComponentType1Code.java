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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.POIComponentType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Generic component type belonging to a POI (Point of Interaction) Terminal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.POIComponentType1Code#Soft
 * POIComponentType1Code.Soft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#EMVKernel
 * POIComponentType1Code.EMVKernel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#EMVLevel1
 * POIComponentType1Code.EMVLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#MerchantInterface
 * POIComponentType1Code.MerchantInterface}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#CardholderInterface
 * POIComponentType1Code.CardholderInterface}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#SecureModule
 * POIComponentType1Code.SecureModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code#PINEntryDevice
 * POIComponentType1Code.PINEntryDevice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
 * POIComponentTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SOFT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "POIComponentType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Generic component type belonging to a POI (Point of Interaction) Terminal."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class POIComponentType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Soft"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code Soft = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Soft";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject();
			codeName = POIComponentTypeCode.Soft.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVKernel"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code EMVKernel = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVKernel";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject();
			codeName = POIComponentTypeCode.EMVKernel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVLevel1"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code EMVLevel1 = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVLevel1";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject();
			codeName = POIComponentTypeCode.EMVLevel1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantInterface"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code MerchantInterface = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantInterface";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject();
			codeName = POIComponentTypeCode.MerchantInterface.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderInterface"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code CardholderInterface = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderInterface";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject();
			codeName = POIComponentTypeCode.CardholderInterface.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureModule"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code SecureModule = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureModule";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject();
			codeName = POIComponentTypeCode.SecureModule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType1Code
	 * POIComponentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINEntryDevice"</li>
	 * </ul>
	 */
	public static final POIComponentType1Code PINEntryDevice = new POIComponentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINEntryDevice";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType1Code.mmObject();
			codeName = POIComponentTypeCode.PINEntryDevice.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, POIComponentType1Code> codesByName = new LinkedHashMap<>();

	protected POIComponentType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SOFT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POIComponentType1Code";
				definition = "Generic component type belonging to a POI (Point of Interaction) Terminal.";
				trace_lazy = () -> POIComponentTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType1Code.Soft, com.tools20022.repository.codeset.POIComponentType1Code.EMVKernel,
						com.tools20022.repository.codeset.POIComponentType1Code.EMVLevel1, com.tools20022.repository.codeset.POIComponentType1Code.MerchantInterface,
						com.tools20022.repository.codeset.POIComponentType1Code.CardholderInterface, com.tools20022.repository.codeset.POIComponentType1Code.SecureModule,
						com.tools20022.repository.codeset.POIComponentType1Code.PINEntryDevice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Soft.getCodeName().get(), Soft);
		codesByName.put(EMVKernel.getCodeName().get(), EMVKernel);
		codesByName.put(EMVLevel1.getCodeName().get(), EMVLevel1);
		codesByName.put(MerchantInterface.getCodeName().get(), MerchantInterface);
		codesByName.put(CardholderInterface.getCodeName().get(), CardholderInterface);
		codesByName.put(SecureModule.getCodeName().get(), SecureModule);
		codesByName.put(PINEntryDevice.getCodeName().get(), PINEntryDevice);
	}

	public static POIComponentType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static POIComponentType1Code[] values() {
		POIComponentType1Code[] values = new POIComponentType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, POIComponentType1Code> {
		@Override
		public POIComponentType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(POIComponentType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}