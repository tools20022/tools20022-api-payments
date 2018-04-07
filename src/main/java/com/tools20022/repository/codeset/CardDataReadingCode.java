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
import com.tools20022.repository.codeset.CardDataReadingCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of reading of the card data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReadingCode#Tag
 * CardDataReadingCode.Tag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#Physical
 * CardDataReadingCode.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#BarCode
 * CardDataReadingCode.BarCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#MagneticStripe
 * CardDataReadingCode.MagneticStripe}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReadingCode#ICC
 * CardDataReadingCode.ICC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#AccountData
 * CardDataReadingCode.AccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#ProximityReader
 * CardDataReadingCode.ProximityReader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#EMVProximityReader
 * CardDataReadingCode.EMVProximityReader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#CardOnFile
 * CardDataReadingCode.CardOnFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#Unknown
 * CardDataReadingCode.Unknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReading1Code
 * CardDataReading1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"TAGC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardDataReadingCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of reading of the card data."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardDataReadingCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tag reading capabilities (RFID, etc.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAGC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tag reading capabilities (RFID, etc.)."</li>
	 * </ul>
	 */
	public static final CardDataReadingCode Tag = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tag";
			definition = "Tag reading capabilities (RFID, etc.).";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject();
			codeName = "TAGC";
		}
	};
	/**
	 * Keyboard entry or OCR reading of embossing or printed data, either at
	 * time of transaction or after the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event."
	 * </li>
	 * </ul>
	 */
	public static final CardDataReadingCode Physical = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Bar code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BarCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bar code."</li>
	 * </ul>
	 */
	public static final CardDataReadingCode BarCode = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BarCode";
			definition = "Bar code.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject();
			codeName = "BRCD";
		}
	};
	/**
	 * Magnetic stripe.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MagneticStripe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Magnetic stripe."</li>
	 * </ul>
	 */
	public static final CardDataReadingCode MagneticStripe = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MagneticStripe";
			definition = "Magnetic stripe.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject();
			codeName = "MGST";
		}
	};
	/**
	 * ICC (Integrated Circuit Card) with contact containing software
	 * applications conform to ISO 7816.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CICC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816."
	 * </li>
	 * </ul>
	 */
	public static final CardDataReadingCode ICC = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICC";
			definition = "ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject();
			codeName = "CICC";
		}
	};
	/**
	 * Account data on file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account data on file."</li>
	 * </ul>
	 */
	public static final CardDataReadingCode AccountData = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountData";
			definition = "Account data on file.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject();
			codeName = "DFLE";
		}
	};
	/**
	 * Contactless proximity reader.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTLS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProximityReader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contactless proximity reader."</li>
	 * </ul>
	 */
	public static final CardDataReadingCode ProximityReader = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProximityReader";
			definition = "Contactless proximity reader.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject();
			codeName = "CTLS";
		}
	};
	/**
	 * Contactless proximity reader, with application conform to the standard
	 * EMV (standard initiated by Europay, Mastercard and Visa).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVProximityReader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa)."
	 * </li>
	 * </ul>
	 */
	public static final CardDataReadingCode EMVProximityReader = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EMVProximityReader";
			definition = "Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject();
			codeName = "ECTL";
		}
	};
	/**
	 * Card information are stored on a file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDFL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardOnFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card information are stored on a file."</li>
	 * </ul>
	 */
	public static final CardDataReadingCode CardOnFile = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardOnFile";
			definition = "Card information are stored on a file.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject();
			codeName = "CDFL";
		}
	};
	/**
	 * Unknown card reading capability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNKW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unknown card reading capability."</li>
	 * </ul>
	 */
	public static final CardDataReadingCode Unknown = new CardDataReadingCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Unknown card reading capability.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReadingCode.mmObject();
			codeName = "UNKW";
		}
	};
	final static private LinkedHashMap<String, CardDataReadingCode> codesByName = new LinkedHashMap<>();

	protected CardDataReadingCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TAGC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardDataReadingCode";
				definition = "Type of reading of the card data.";
				derivation_lazy = () -> Arrays.asList(CardDataReading1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardDataReadingCode.Tag, com.tools20022.repository.codeset.CardDataReadingCode.Physical, com.tools20022.repository.codeset.CardDataReadingCode.BarCode,
						com.tools20022.repository.codeset.CardDataReadingCode.MagneticStripe, com.tools20022.repository.codeset.CardDataReadingCode.ICC, com.tools20022.repository.codeset.CardDataReadingCode.AccountData,
						com.tools20022.repository.codeset.CardDataReadingCode.ProximityReader, com.tools20022.repository.codeset.CardDataReadingCode.EMVProximityReader, com.tools20022.repository.codeset.CardDataReadingCode.CardOnFile,
						com.tools20022.repository.codeset.CardDataReadingCode.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Tag.getCodeName().get(), Tag);
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(BarCode.getCodeName().get(), BarCode);
		codesByName.put(MagneticStripe.getCodeName().get(), MagneticStripe);
		codesByName.put(ICC.getCodeName().get(), ICC);
		codesByName.put(AccountData.getCodeName().get(), AccountData);
		codesByName.put(ProximityReader.getCodeName().get(), ProximityReader);
		codesByName.put(EMVProximityReader.getCodeName().get(), EMVProximityReader);
		codesByName.put(CardOnFile.getCodeName().get(), CardOnFile);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static CardDataReadingCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardDataReadingCode[] values() {
		CardDataReadingCode[] values = new CardDataReadingCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardDataReadingCode> {
		@Override
		public CardDataReadingCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardDataReadingCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}